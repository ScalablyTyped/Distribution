package typings.mailgunJs.mod

import typings.mailgunJs.mod.lists.Member
import typings.mailgunJs.mod.lists.Members
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lists_ extends StObject {
  
  def delete(): js.Promise[DeleteResponse] = js.native
  def delete(callback: js.Function2[/* error */ Error, /* body */ DeleteResponse, Unit]): js.Promise[DeleteResponse] = js.native
  
  def info(): js.Promise[_] = js.native
  def info(callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  
  def members(): Members = js.native
  def members(member: String): Member = js.native
}
