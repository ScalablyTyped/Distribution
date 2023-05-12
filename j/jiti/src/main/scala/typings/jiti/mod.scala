package typings.jiti

import typings.jiti.distTypesMod.JITIOptions
import typings.jiti.distTypesMod.TransformOptions
import typings.node.NodeModule
import typings.node.NodeRequire
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jiti", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_filename: String): JITI = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any]).asInstanceOf[JITI]
  inline def default(_filename: String, opts: Unit, parentModule: Unit, requiredModules: Record[String, NodeModule]): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any], requiredModules.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(_filename: String, opts: Unit, parentModule: NodeModule): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(
    _filename: String,
    opts: Unit,
    parentModule: NodeModule,
    requiredModules: Record[String, NodeModule]
  ): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any], requiredModules.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(_filename: String, opts: JITIOptions): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(
    _filename: String,
    opts: JITIOptions,
    parentModule: Unit,
    requiredModules: Record[String, NodeModule]
  ): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any], requiredModules.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(_filename: String, opts: JITIOptions, parentModule: NodeModule): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any])).asInstanceOf[JITI]
  inline def default(
    _filename: String,
    opts: JITIOptions,
    parentModule: NodeModule,
    requiredModules: Record[String, NodeModule]
  ): JITI = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], parentModule.asInstanceOf[js.Any], requiredModules.asInstanceOf[js.Any])).asInstanceOf[JITI]
  
  @js.native
  trait JITI
    extends StObject
       with typings.node.NodeJS.Require {
    
    def register(): js.Function0[Unit] = js.native
    
    def transform(opts: TransformOptions): String = js.native
  }
  
  type Require = NodeRequire
}
