package typings.i18nextNodeFsBackend

import typings.i18next.mod.BackendModule
import typings.i18next.mod.InitOptions
import typings.i18next.mod.Services
import typings.i18nextNodeFsBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import typings.i18nextNodeFsBackend.i18nextNodeFsBackendStrings.backend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof Backend` */
  @JSImport("i18next-node-fs-backend", JSImport.Namespace)
  @js.native
  class ^ () extends Backend {
    def this(services: js.Any) = this()
    def this(services: js.UndefOr[scala.Nothing], options: i18nextNodeFsBackEndOptions) = this()
    def this(services: js.Any, options: i18nextNodeFsBackEndOptions) = this()
  }
  
  @js.native
  trait Backend extends BackendModule[i18nextNodeFsBackEndOptions] {
    
    def init(services: Services): Unit = js.native
    def init(services: Services, backendOptions: js.UndefOr[scala.Nothing], i18nextOptions: InitOptions): Unit = js.native
    def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
    
    @JSName("type")
    var type_Backend: backend = js.native
  }
  
  /* was `typeof Backend` */
  type module = Backend
}
