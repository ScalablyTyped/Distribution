package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionFootnotes extends StObject {
  
  var description: String
  
  var footnotes: js.Array[Url]
  
  var name: String
  
  var summary: String
}
object DescriptionFootnotes {
  
  inline def apply(description: String, footnotes: js.Array[Url], name: String, summary: String): DescriptionFootnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFootnotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionFootnotes] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFootnotes(value: js.Array[Url]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    inline def setFootnotesVarargs(value: Url*): Self = StObject.set(x, "footnotes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
