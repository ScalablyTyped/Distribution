package typings.ionicUtilsFs

import typings.ionicUtilsFs.mod.FileType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicUtilsFsStrings {
  
  @js.native
  sealed trait buffer extends StObject
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait directory
    extends StObject
       with FileType
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait file
    extends StObject
       with FileType
  inline def file: file = "file".asInstanceOf[file]
}
