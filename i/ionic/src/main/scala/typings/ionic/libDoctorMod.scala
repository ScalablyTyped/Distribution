package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor", JSImport.Namespace)
@js.native
object libDoctorMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typings.ionic.ailmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typings.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typings.ionic.ailmentsMod.CordovaPlatformsCommitted
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typings.ionic.ailmentsMod.DefaultCordovaBundleIdUsed
  
  @js.native
  class GitConfigInvalid ()
    extends typings.ionic.ailmentsMod.GitConfigInvalid
  
  @js.native
  class GitNotUsed ()
    extends typings.ionic.ailmentsMod.GitNotUsed
  
  @js.native
  class IonicCLIInstalledLocally ()
    extends typings.ionic.ailmentsMod.IonicCLIInstalledLocally
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typings.ionic.ailmentsMod.IonicNativeOldVersionInstalled
  
  @js.native
  class NpmInstalledLocally ()
    extends typings.ionic.ailmentsMod.NpmInstalledLocally
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typings.ionic.ailmentsMod.UnsavedCordovaPlatforms
  
  @js.native
  class ViewportFitNotSet ()
    extends typings.ionic.ailmentsMod.ViewportFitNotSet
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

