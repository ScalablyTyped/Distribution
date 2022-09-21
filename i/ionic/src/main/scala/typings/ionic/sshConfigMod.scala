package typings.ionic

import typings.ionic.anon.Host
import typings.sshConfig.mod.SSHConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshConfigMod {
  
  @JSImport("ionic/lib/ssh-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SSHConfig {
    
    @JSImport("ionic/lib/ssh-config", "SSHConfig.default")
    @js.native
    open class default ()
      extends typings.sshConfig.mod.default
    
    @JSImport("ionic/lib/ssh-config", "SSHConfig.ELine")
    @js.native
    object ELine extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sshConfig.mod.ELine & Double] = js.native
      
      /* 2 */ val COMMENT: typings.sshConfig.mod.ELine.COMMENT & Double = js.native
      
      /* 1 */ val DIRECTIVE: typings.sshConfig.mod.ELine.DIRECTIVE & Double = js.native
    }
  }
  
  inline def ensureHostAndKeyPath(
    conf: SSHConfig[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ],
    conn: Host,
    keyPath: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureHostAndKeyPath")(conf.asInstanceOf[js.Any], conn.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findHostSection(
    conf: SSHConfig[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ],
    host: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findHostSection")(conf.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective */ Any) | Null]
  
  inline def getConfigPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigPath")().asInstanceOf[String]
  
  inline def isDirective(entry: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(entry.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigDirective * / any */ Boolean]
  
  inline def isHostDirective(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.Config */ Any
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHostDirective")(entry.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SSHConfig.ConfigHostDirective * / any */ Boolean]
  
  inline def loadFromPath(p: String): js.Promise[
    SSHConfig[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromPath")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    SSHConfig[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ]
  ]]
}
