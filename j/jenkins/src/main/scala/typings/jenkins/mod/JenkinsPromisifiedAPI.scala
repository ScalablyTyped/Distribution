package typings.jenkins.mod

import typings.jenkins.anon.Copy
import typings.jenkins.anon.Create
import typings.jenkins.anon.Destroy
import typings.jenkins.anon.Item
import typings.jenkins.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JenkinsPromisifiedAPI extends js.Object {
  
  var build: Log = js.native
  
  def info(): js.Promise[_] = js.native
  
  var job: Copy = js.native
  
  var node: Create = js.native
  
  var queue: Item = js.native
  
  var view: Destroy = js.native
}
object JenkinsPromisifiedAPI {
  
  @scala.inline
  def apply(build: Log, info: () => js.Promise[_], job: Copy, node: Create, queue: Item, view: Destroy): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
  
  @scala.inline
  implicit class JenkinsPromisifiedAPIOps[Self <: JenkinsPromisifiedAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: Log): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: () => js.Promise[_]): Self = this.set("info", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJob(value: Copy): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Create): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: Item): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: Destroy): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
