package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.ChownFileResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entries extends StObject {
  
  var entries: js.Array[ChownFileResult] = js.native
  
  var id: String = js.native
}
object Entries {
  
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  
  @scala.inline
  implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ChownFileResult]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: ChownFileResult*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
