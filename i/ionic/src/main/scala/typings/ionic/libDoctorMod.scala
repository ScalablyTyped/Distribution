package typings.ionic

import typings.ionic.definitionsMod.IAilment
import typings.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorMod {
  
  @JSImport("ionic/lib/doctor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ionic/lib/doctor", "Ailment")
  @js.native
  open class Ailment protected ()
    extends typings.ionic.libDoctorAilmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "AilmentRegistry")
  @js.native
  open class AilmentRegistry ()
    extends typings.ionic.libDoctorAilmentsMod.AilmentRegistry
  
  @JSImport("ionic/lib/doctor", "CordovaPlatformsCommitted")
  @js.native
  open class CordovaPlatformsCommitted protected ()
    extends typings.ionic.libDoctorAilmentsMod.CordovaPlatformsCommitted {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "DefaultCordovaBundleIdUsed")
  @js.native
  open class DefaultCordovaBundleIdUsed protected ()
    extends typings.ionic.libDoctorAilmentsMod.DefaultCordovaBundleIdUsed {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "GitConfigInvalid")
  @js.native
  open class GitConfigInvalid protected ()
    extends typings.ionic.libDoctorAilmentsMod.GitConfigInvalid {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "GitNotUsed")
  @js.native
  open class GitNotUsed protected ()
    extends typings.ionic.libDoctorAilmentsMod.GitNotUsed {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "IonicCLIInstalledLocally")
  @js.native
  open class IonicCLIInstalledLocally protected ()
    extends typings.ionic.libDoctorAilmentsMod.IonicCLIInstalledLocally {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "IonicNativeOldVersionInstalled")
  @js.native
  open class IonicNativeOldVersionInstalled protected ()
    extends typings.ionic.libDoctorAilmentsMod.IonicNativeOldVersionInstalled {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "NpmInstalledLocally")
  @js.native
  open class NpmInstalledLocally protected ()
    extends typings.ionic.libDoctorAilmentsMod.NpmInstalledLocally {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "UnsavedCordovaPlatforms")
  @js.native
  open class UnsavedCordovaPlatforms protected ()
    extends typings.ionic.libDoctorAilmentsMod.UnsavedCordovaPlatforms {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor", "ViewportFitNotSet")
  @js.native
  open class ViewportFitNotSet protected ()
    extends typings.ionic.libDoctorAilmentsMod.ViewportFitNotSet {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  inline def formatAilmentMessage(ailment: IAilment): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAilmentMessage")(ailment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
