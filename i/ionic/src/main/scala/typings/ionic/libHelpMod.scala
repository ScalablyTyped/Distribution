package typings.ionic

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typings.ionicCliFramework.libHelpMod.CommandHelpSchemaFootnote
import typings.ionicCliFramework.libHelpMod.CommandHelpSchemaInput
import typings.ionicCliFramework.libHelpMod.CommandHelpSchemaOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpMod {
  
  @JSImport("ionic/lib/help", "CommandSchemaHelpFormatter")
  @js.native
  open class CommandSchemaHelpFormatter protected ()
    extends typings.ionicCliFramework.mod.CommandSchemaHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(hasLocationCommandMetadataColors: typings.ionicCliFramework.libHelpMod.CommandHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]) = this()
  }
  
  @JSImport("ionic/lib/help", "CommandStringHelpFormatter")
  @js.native
  open class CommandStringHelpFormatter protected ()
    extends typings.ionicCliFramework.mod.CommandStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(options: CommandHelpFormatterDeps) = this()
  }
  
  @JSImport("ionic/lib/help", "NamespaceSchemaHelpFormatter")
  @js.native
  open class NamespaceSchemaHelpFormatter protected ()
    extends typings.ionicCliFramework.mod.NamespaceSchemaHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(hasLocationNamespaceColors: typings.ionicCliFramework.libHelpMod.NamespaceHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]) = this()
  }
  
  @JSImport("ionic/lib/help", "NamespaceStringHelpFormatter")
  @js.native
  open class NamespaceStringHelpFormatter protected ()
    extends typings.ionicCliFramework.mod.NamespaceStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(hasVersionInProjectRest: NamespaceHelpFormatterDeps) = this()
    
    def formatIonicHeader(): js.Promise[String] = js.native
    
    /* protected */ val inProject: Boolean = js.native
    
    /* protected */ val version: String = js.native
  }
  
  type CommandHelpFormatterDeps = typings.ionicCliFramework.libHelpMod.CommandHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  
  trait CommandHelpSchema
    extends StObject
       with typings.ionicCliFramework.libHelpMod.CommandHelpSchema {
    
    var `type`: String
  }
  object CommandHelpSchema {
    
    inline def apply(
      aliases: js.Array[String],
      description: String,
      exampleCommands: js.Array[String],
      footnotes: js.Array[CommandHelpSchemaFootnote],
      groups: js.Array[String],
      inputs: js.Array[CommandHelpSchemaInput],
      name: String,
      namespace: js.Array[String],
      options: js.Array[CommandHelpSchemaOption],
      summary: String,
      `type`: String
    ): CommandHelpSchema = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpSchema]
    }
    
    extension [Self <: CommandHelpSchema](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamespaceHelpFormatterDeps
    extends StObject
       with typings.ionicCliFramework.libHelpMod.NamespaceHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    
    val inProject: Boolean
    
    val version: String
  }
  object NamespaceHelpFormatterDeps {
    
    inline def apply(
      inProject: Boolean,
      location: NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption],
      namespace: INamespace,
      version: String
    ): NamespaceHelpFormatterDeps = {
      val __obj = js.Dynamic.literal(inProject = inProject.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceHelpFormatterDeps]
    }
    
    extension [Self <: NamespaceHelpFormatterDeps](x: Self) {
      
      inline def setInProject(value: Boolean): Self = StObject.set(x, "inProject", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
