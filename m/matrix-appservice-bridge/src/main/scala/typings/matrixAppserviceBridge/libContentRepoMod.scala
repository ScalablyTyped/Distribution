package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.crop
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContentRepoMod {
  
  object ContentRepo {
    
    @JSImport("matrix-appservice-bridge/lib/contentRepo", "ContentRepo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/contentRepo", "ContentRepo.getHttpUriForMxc")
    @js.native
    def getHttpUriForMxc: js.Function6[
        /* baseUrl */ String, 
        /* mxc */ String, 
        /* width */ js.UndefOr[Double], 
        /* height */ js.UndefOr[Double], 
        /* resizeMethod */ js.UndefOr[crop | scale], 
        /* allowDirectLinks */ js.UndefOr[Boolean], 
        String
      ] = js.native
    inline def getHttpUriForMxc(baseUrl: String, mxc: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Double, height: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Double, height: Double, resizeMethod: crop | scale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Double,
      height: Double,
      resizeMethod: crop | scale,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Double,
      height: Double,
      resizeMethod: Unit,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Double, height: Unit, resizeMethod: crop | scale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Double,
      height: Unit,
      resizeMethod: crop | scale,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Double,
      height: Unit,
      resizeMethod: Unit,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Unit, height: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Unit, height: Double, resizeMethod: crop | scale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Unit,
      height: Double,
      resizeMethod: crop | scale,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Unit,
      height: Double,
      resizeMethod: Unit,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(baseUrl: String, mxc: String, width: Unit, height: Unit, resizeMethod: crop | scale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Unit,
      height: Unit,
      resizeMethod: crop | scale,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc(
      baseUrl: String,
      mxc: String,
      width: Unit,
      height: Unit,
      resizeMethod: Unit,
      allowDirectLinks: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpUriForMxc")(baseUrl.asInstanceOf[js.Any], mxc.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], resizeMethod.asInstanceOf[js.Any], allowDirectLinks.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getHttpUriForMxc_=(
      x: js.Function6[
          /* baseUrl */ String, 
          /* mxc */ String, 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          /* resizeMethod */ js.UndefOr[crop | scale], 
          /* allowDirectLinks */ js.UndefOr[Boolean], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getHttpUriForMxc")(x.asInstanceOf[js.Any])
  }
}
