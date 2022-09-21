package typings.matterJs.mod

import typings.matterJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def use(plugins: (Plugin | String)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

/* Rewritten from type alias, can be one of: 
  - typings.matterJs.anon.Name
  - typings.matterJs.anon.Version
  - java.lang.String
*/
type Dependency = _Dependency | String
