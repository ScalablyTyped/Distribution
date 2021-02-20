package typings.ionic.anon

import typings.ionicCliFramework.definitionsMod.MetadataGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footnotes extends StObject {
  
  var description: String = js.native
  
  var footnotes: js.Array[Id] = js.native
  
  var groups: js.Array[MetadataGroup] = js.native
  
  var name: String = js.native
  
  var summary: String = js.native
}
object Footnotes {
  
  @scala.inline
  def apply(
    description: String,
    footnotes: js.Array[Id],
    groups: js.Array[MetadataGroup],
    name: String,
    summary: String
  ): Footnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnotes]
  }
  
  @scala.inline
  implicit class FootnotesMutableBuilder[Self <: Footnotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotes(value: js.Array[Id]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesVarargs(value: Id*): Self = StObject.set(x, "footnotes", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[MetadataGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: MetadataGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
