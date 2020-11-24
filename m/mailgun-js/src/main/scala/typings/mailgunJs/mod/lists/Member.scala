package typings.mailgunJs.mod.lists

import typings.mailgunJs.mod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  def delete(): js.Promise[_] = js.native
  def delete(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  
  def update(data: MemberUpdateData): js.Promise[_] = js.native
  def update(data: MemberUpdateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
}
