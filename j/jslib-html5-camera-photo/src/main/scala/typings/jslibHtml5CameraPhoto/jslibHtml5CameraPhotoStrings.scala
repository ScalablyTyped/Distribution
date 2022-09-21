package typings.jslibHtml5CameraPhoto

import typings.jslibHtml5CameraPhoto.mod.FacingMode
import typings.jslibHtml5CameraPhoto.mod.ImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jslibHtml5CameraPhotoStrings {
  
  @js.native
  sealed trait environment
    extends StObject
       with FacingMode
  inline def environment: environment = "environment".asInstanceOf[environment]
  
  @js.native
  sealed trait jpg
    extends StObject
       with ImageType
  inline def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageType
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait user
    extends StObject
       with FacingMode
  inline def user: user = "user".asInstanceOf[user]
}
