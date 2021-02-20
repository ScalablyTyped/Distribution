package typings.ionic.anon

import typings.ionicCliFramework.definitionsMod.MetadataGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionGroups extends StObject {
  
  var description: String = js.native
  
  var groups: js.Array[MetadataGroup] = js.native
  
  var name: String = js.native
  
  var summary: String = js.native
}
object DescriptionGroups {
  
  @scala.inline
  def apply(description: String, groups: js.Array[MetadataGroup], name: String, summary: String): DescriptionGroups = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionGroups]
  }
  
  @scala.inline
  implicit class DescriptionGroupsMutableBuilder[Self <: DescriptionGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
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
