package typings.listJs

import typings.listJs.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listJsStrings {
  
  @scala.inline
  def filterComplete: filterComplete = "filterComplete".asInstanceOf[filterComplete]
  
  @scala.inline
  def filterStart: filterStart = "filterStart".asInstanceOf[filterStart]
  
  @scala.inline
  def searchComplete: searchComplete = "searchComplete".asInstanceOf[searchComplete]
  
  @scala.inline
  def searchStart: searchStart = "searchStart".asInstanceOf[searchStart]
  
  @scala.inline
  def sortComplete: sortComplete = "sortComplete".asInstanceOf[sortComplete]
  
  @scala.inline
  def sortStart: sortStart = "sortStart".asInstanceOf[sortStart]
  
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  
  @js.native
  sealed trait filterComplete extends Event
  
  @js.native
  sealed trait filterStart extends Event
  
  @js.native
  sealed trait searchComplete extends Event
  
  @js.native
  sealed trait searchStart extends Event
  
  @js.native
  sealed trait sortComplete extends Event
  
  @js.native
  sealed trait sortStart extends Event
  
  @js.native
  sealed trait updated extends Event
}
