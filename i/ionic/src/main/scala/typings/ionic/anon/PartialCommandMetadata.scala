package typings.ionic.anon

import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.Footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.CommandMetadata> */
@js.native
trait PartialCommandMetadata extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var exampleCommands: js.UndefOr[js.Array[String]] = js.native
  
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.native
  
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  var inputs: js.UndefOr[js.Array[CommandMetadataInput]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[js.Array[CommandMetadataOption]] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[global | project] = js.native
}
object PartialCommandMetadata {
  
  @scala.inline
  def apply(): PartialCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommandMetadata]
  }
  
  @scala.inline
  implicit class PartialCommandMetadataMutableBuilder[Self <: PartialCommandMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleCommandsUndefined: Self = StObject.set(x, "exampleCommands", js.undefined)
    
    @scala.inline
    def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value :_*))
    
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
    def setInputs(value: js.Array[CommandMetadataInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: CommandMetadataInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[CommandMetadataOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: CommandMetadataOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setType(value: global | project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
