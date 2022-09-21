package typings.googleapis.displayvideoMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.displayvideoV1Mod.displayvideoV1.Displayvideo
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Displayvideo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    Displayvideo
  ] = js.native
  inline def v1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      Displayvideo
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1beta")
  @js.native
  open class v1beta protected ()
    extends typings.googleapis.displayvideoV1betaMod.displayvideoV1beta.Displayvideo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1beta")
  @js.native
  def v1beta: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.displayvideoV1betaMod.displayvideoV1beta.Displayvideo
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1beta2")
  @js.native
  open class v1beta2 protected ()
    extends typings.googleapis.displayvideoV1beta2Mod.displayvideoV1beta2.Displayvideo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1beta2")
  @js.native
  def v1beta2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.displayvideoV1beta2Mod.displayvideoV1beta2.Displayvideo
  ] = js.native
  inline def v1beta2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.displayvideoV1beta2Mod.displayvideoV1beta2.Displayvideo
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  
  inline def v1beta_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.displayvideoV1betaMod.displayvideoV1beta.Displayvideo
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1dev")
  @js.native
  open class v1dev protected ()
    extends typings.googleapis.v1devMod.displayvideoV1dev.Displayvideo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/displayvideo", "VERSIONS.v1dev")
  @js.native
  def v1dev: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.v1devMod.displayvideoV1dev.Displayvideo
  ] = js.native
  inline def v1dev_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.v1devMod.displayvideoV1dev.Displayvideo
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1dev")(x.asInstanceOf[js.Any])
}
