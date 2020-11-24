package typings.luminoCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoCommandsStrings {
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  
  @scala.inline
  def `many-changed`: `many-changed` = "many-changed".asInstanceOf[`many-changed`]
  
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait added extends js.Object
  
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait `many-changed` extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
}
