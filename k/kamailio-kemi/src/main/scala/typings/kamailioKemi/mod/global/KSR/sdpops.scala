package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdpops {
  
  @JSGlobal("KSR.sdpops")
  @js.native
  val ^ : js.Any = js.native
  
  inline def keepCodecsById(codecs: String, media: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("keep_codecs_by_id")(codecs.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def keepCodecsByName(codecs: String, media: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("keep_codecs_by_name")(codecs.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeCodecsById(codecs: String, media: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_codecs_by_id")(codecs.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeCodecsByName(codecs: String, media: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_codecs_by_name")(codecs.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeLineByPrefix(prefix: String, media: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_line_by_prefix")(prefix.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeMedia(media: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_media")(media.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpContent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_content")().asInstanceOf[Double]
  
  inline def sdpContentFlags(flags: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_content_flags")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpGet(avp: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_get")(avp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpGetLineStartswith(aname: String, sline: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sdp_get_line_startswith")(aname.asInstanceOf[js.Any], sline.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sdpPrint(llevel: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_print")(llevel.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpTransport(avp: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_transport")(avp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpWithActiveMedia(media: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_with_active_media")(media.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sdpWithIce(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_with_ice")().asInstanceOf[Double]
  
  inline def sdpWithMedia(media: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sdp_with_media")(media.asInstanceOf[js.Any]).asInstanceOf[Double]
}
