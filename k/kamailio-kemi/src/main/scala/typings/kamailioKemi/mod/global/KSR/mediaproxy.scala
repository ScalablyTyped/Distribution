package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaproxy {
  
  @JSGlobal("KSR.mediaproxy")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def endMediaSession(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("end_media_session")().asInstanceOf[Double]
  
  @scala.inline
  def engageMediaProxy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("engage_media_proxy")().asInstanceOf[Double]
  
  @scala.inline
  def useMediaProxy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("use_media_proxy")().asInstanceOf[Double]
}
