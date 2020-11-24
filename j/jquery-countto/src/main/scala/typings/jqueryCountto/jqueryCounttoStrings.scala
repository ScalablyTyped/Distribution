package typings.jqueryCountto

import typings.jqueryCountto.mod.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jqueryCounttoStrings {
  
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait restart extends Method
  
  @js.native
  sealed trait start extends Method
  
  @js.native
  sealed trait stop extends Method
  
  @js.native
  sealed trait toggle extends Method
}
