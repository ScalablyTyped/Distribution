package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdevtoolsReaddirEnhancedStrings {
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
  
  @js.native
  sealed trait directory extends EventName
  
  @js.native
  sealed trait error extends EventName
  
  @js.native
  sealed trait file extends EventName
  
  @js.native
  sealed trait symlink extends EventName
}
