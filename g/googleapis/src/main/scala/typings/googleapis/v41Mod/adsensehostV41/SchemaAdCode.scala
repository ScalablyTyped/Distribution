package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdCode extends StObject {
  
  /**
    * The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.native
  
  /**
    * Kind this is, in this case adsensehost#adCode.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAdCode {
  
  @scala.inline
  def apply(): SchemaAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdCode]
  }
  
  @scala.inline
  implicit class SchemaAdCodeMutableBuilder[Self <: SchemaAdCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
