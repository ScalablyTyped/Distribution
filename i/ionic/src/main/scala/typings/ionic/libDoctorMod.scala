package typings.ionic

import typings.ionic.definitionsMod.IAilment
import typings.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor", JSImport.Namespace)
@js.native
object libDoctorMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typings.ionic.libDoctorAilmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typings.ionic.libDoctorAilmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typings.ionic.libDoctorAilmentsMod.CordovaPlatformsCommitted
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typings.ionic.libDoctorAilmentsMod.DefaultCordovaBundleIdUsed
  
  @js.native
  class GitConfigInvalid ()
    extends typings.ionic.libDoctorAilmentsMod.GitConfigInvalid
  
  @js.native
  class GitNotUsed ()
    extends typings.ionic.libDoctorAilmentsMod.GitNotUsed
  
  @js.native
  class IonicCLIInstalledLocally ()
    extends typings.ionic.libDoctorAilmentsMod.IonicCLIInstalledLocally
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typings.ionic.libDoctorAilmentsMod.IonicNativeOldVersionInstalled
  
  @js.native
  class NpmInstalledLocally ()
    extends typings.ionic.libDoctorAilmentsMod.NpmInstalledLocally
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typings.ionic.libDoctorAilmentsMod.UnsavedCordovaPlatforms
  
  @js.native
  class ViewportFitNotSet ()
    extends typings.ionic.libDoctorAilmentsMod.ViewportFitNotSet
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

