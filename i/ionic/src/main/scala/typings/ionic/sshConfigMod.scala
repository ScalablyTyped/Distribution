package typings.ionic

import typings.ionic.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshConfigMod {
  
  @JSImport("ionic/lib/ssh-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureHostAndKeyPath(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    conn: Host,
    keyPath: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureHostAndKeyPath")(conf.asInstanceOf[js.Any], conn.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findHostSection(
    conf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any,
    host: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findHostSection")(conf.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ js.Any) | Null]
  
  inline def getConfigPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigPath")().asInstanceOf[String]
  
  inline def isDirective(entry: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(entry.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean]
  
  inline def isHostDirective(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.Config */ js.Any
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHostDirective")(entry.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean]
  
  inline def loadFromPath(p: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromPath")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.SSHConfig */ js.Any
  ]]
}
