package typings.googleapis.visionMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.visionV1Mod.visionV1.Vision
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Vision] = js.native
  inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Vision]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1p1beta1")
  @js.native
  open class v1p1beta1 protected ()
    extends typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1p1beta1")
  @js.native
  def v1p1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision
  ] = js.native
  inline def v1p1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1p1beta1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1p2beta1")
  @js.native
  open class v1p2beta1 protected ()
    extends typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/vision", "VERSIONS.v1p2beta1")
  @js.native
  def v1p2beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision
  ] = js.native
  inline def v1p2beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1p2beta1")(x.asInstanceOf[js.Any])
}
