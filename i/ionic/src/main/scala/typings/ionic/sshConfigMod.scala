package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/ssh-config", JSImport.Namespace)
@js.native
object sshConfigMod extends js.Object {
  def ensureHostAndKeyPath(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    conn: AnonHost,
    keyPath: String
  ): Unit = js.native
  def findHostSection(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    host: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ js.Any) | Null = js.native
  def getConfigPath(): String = js.native
  def isDirective(entry: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean = js.native
  def isHostDirective(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.Config */ js.Any
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean = js.native
  def loadFromPath(p: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ _
  ] = js.native
}

