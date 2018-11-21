package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", JSImport.Namespace)
@js.native
object libHelpModMembers extends js.Object {
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): stdLib.Required[
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption
    ]
  ] = js.native
  def formatOptionName[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O): java.lang.String = js.native
  def formatOptionName[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O, hasShowAliasesColors: atIonicCliDashFrameworkLib.Anon_ColorsShowAliases): java.lang.String = js.native
}

