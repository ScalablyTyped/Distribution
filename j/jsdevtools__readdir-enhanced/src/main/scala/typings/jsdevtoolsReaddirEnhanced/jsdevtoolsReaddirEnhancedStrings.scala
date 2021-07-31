package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdevtoolsReaddirEnhancedStrings {
  
  @js.native
  sealed trait directory
    extends StObject
       with EventName
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait error
    extends StObject
       with EventName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait file
    extends StObject
       with EventName
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait symlink
    extends StObject
       with EventName
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
}
