package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionFootnotes extends StObject {
  
  var description: String = js.native
  
  var footnotes: js.Array[Url] = js.native
  
  var name: String = js.native
  
  var summary: String = js.native
}
object DescriptionFootnotes {
  
  @scala.inline
  def apply(description: String, footnotes: js.Array[Url], name: String, summary: String): DescriptionFootnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFootnotes]
  }
  
  @scala.inline
  implicit class DescriptionFootnotesMutableBuilder[Self <: DescriptionFootnotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotes(value: js.Array[Url]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesVarargs(value: Url*): Self = StObject.set(x, "footnotes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
