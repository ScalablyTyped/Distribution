package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.undefined
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var summary: String
}
object Metadata {
  
  @scala.inline
  def apply(name: String, summary: String): Metadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFootnotes(value: js.Array[Footnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
    
    @scala.inline
    def setFootnotesVarargs(value: Footnote*): Self = StObject.set(x, "footnotes", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
