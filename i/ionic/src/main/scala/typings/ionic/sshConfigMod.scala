package typings.ionic

import typings.ionic.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshConfigMod {
  
  @JSImport("ionic/lib/ssh-config", "ensureHostAndKeyPath")
  @js.native
  def ensureHostAndKeyPath(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    conn: Host,
    keyPath: String
  ): Unit = js.native
  
  @JSImport("ionic/lib/ssh-config", "findHostSection")
  @js.native
  def findHostSection(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    host: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ js.Any) | Null = js.native
  
  @JSImport("ionic/lib/ssh-config", "getConfigPath")
  @js.native
  def getConfigPath(): String = js.native
  
  @JSImport("ionic/lib/ssh-config", "isDirective")
  @js.native
  def isDirective(entry: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean = js.native
  
  @JSImport("ionic/lib/ssh-config", "isHostDirective")
  @js.native
  def isHostDirective(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.Config */ js.Any
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean = js.native
  
  @JSImport("ionic/lib/ssh-config", "loadFromPath")
  @js.native
  def loadFromPath(p: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ _
  ] = js.native
}
