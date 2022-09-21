package typings.googleapis.osconfigMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.osconfigV1Mod.osconfigV1.Osconfig
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Osconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Osconfig] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Osconfig]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1alpha")
  @js.native
  open class v1alpha protected ()
    extends typings.googleapis.osconfigV1alphaMod.osconfigV1alpha.Osconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1alpha")
  @js.native
  def v1alpha: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.osconfigV1alphaMod.osconfigV1alpha.Osconfig
  ] = js.native
  inline def v1alpha_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.osconfigV1alphaMod.osconfigV1alpha.Osconfig
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1beta")
  @js.native
  open class v1beta protected ()
    extends typings.googleapis.osconfigV1betaMod.osconfigV1beta.Osconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/osconfig", "VERSIONS.v1beta")
  @js.native
  def v1beta: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.osconfigV1betaMod.osconfigV1beta.Osconfig
  ] = js.native
  inline def v1beta_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.osconfigV1betaMod.osconfigV1beta.Osconfig
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
}
