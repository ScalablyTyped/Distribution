package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Readonly<@ionic/cli-framework.@ionic/cli-framework/definitions.NamespaceMetadata> ]: -? std.Readonly<@ionic/cli-framework.@ionic/cli-framework/definitions.NamespaceMetadata>[P]} */ trait HydratedNamespaceMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val aliases: js.Array[java.lang.String]
  val namespace: N
}

object HydratedNamespaceMetadata {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](aliases: js.Array[java.lang.String], namespace: N): HydratedNamespaceMetadata[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(aliases = aliases, namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HydratedNamespaceMetadata[C, N, M, I, O]]
  }
}

