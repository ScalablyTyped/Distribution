package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IAilment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorMod {
  
  @JSImport("ionic/lib/doctor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/doctor", "Ailment")
  @js.native
  abstract class Ailment protected ()
    extends typings.ionic.ailmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "AilmentRegistry")
  @js.native
  class AilmentRegistry ()
    extends typings.ionic.ailmentsMod.AilmentRegistry
  
  @JSImport("ionic/lib/doctor", "CordovaPlatformsCommitted")
  @js.native
  class CordovaPlatformsCommitted protected ()
    extends typings.ionic.ailmentsMod.CordovaPlatformsCommitted {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "DefaultCordovaBundleIdUsed")
  @js.native
  class DefaultCordovaBundleIdUsed protected ()
    extends typings.ionic.ailmentsMod.DefaultCordovaBundleIdUsed {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "GitConfigInvalid")
  @js.native
  class GitConfigInvalid protected ()
    extends typings.ionic.ailmentsMod.GitConfigInvalid {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "GitNotUsed")
  @js.native
  class GitNotUsed protected ()
    extends typings.ionic.ailmentsMod.GitNotUsed {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "IonicCLIInstalledLocally")
  @js.native
  class IonicCLIInstalledLocally protected ()
    extends typings.ionic.ailmentsMod.IonicCLIInstalledLocally {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "IonicNativeOldVersionInstalled")
  @js.native
  class IonicNativeOldVersionInstalled protected ()
    extends typings.ionic.ailmentsMod.IonicNativeOldVersionInstalled {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "NpmInstalledLocally")
  @js.native
  class NpmInstalledLocally protected ()
    extends typings.ionic.ailmentsMod.NpmInstalledLocally {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "UnsavedCordovaPlatforms")
  @js.native
  class UnsavedCordovaPlatforms protected ()
    extends typings.ionic.ailmentsMod.UnsavedCordovaPlatforms {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "ViewportFitNotSet")
  @js.native
  class ViewportFitNotSet protected ()
    extends typings.ionic.ailmentsMod.ViewportFitNotSet {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  inline def formatAilmentMessage(ailment: IAilment): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAilmentMessage")(ailment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
