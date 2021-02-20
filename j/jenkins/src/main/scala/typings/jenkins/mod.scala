package typings.jenkins

import typings.jenkins.anon.Add
import typings.jenkins.anon.BaseUrl
import typings.jenkins.anon.Build
import typings.jenkins.anon.Cancel
import typings.jenkins.anon.Config
import typings.jenkins.anon.Copy
import typings.jenkins.anon.Create
import typings.jenkins.anon.CrumbIssuer
import typings.jenkins.anon.Destroy
import typings.jenkins.anon.Get
import typings.jenkins.anon.Item
import typings.jenkins.anon.Log
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jenkins", JSImport.Namespace)
  @js.native
  def apply(): JenkinsAPI = js.native
  @JSImport("jenkins", JSImport.Namespace)
  @js.native
  def apply(opts: BaseUrl): JenkinsAPI = js.native
  @JSImport("jenkins", JSImport.Namespace)
  @js.native
  def apply(opts: CrumbIssuer): JenkinsPromisifiedAPI = js.native
  
  @js.native
  trait JenkinsAPI extends StObject {
    
    var build: Get = js.native
    
    def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    var job: Build = js.native
    
    var node: Config = js.native
    
    var queue: Cancel = js.native
    
    var view: Add = js.native
  }
  object JenkinsAPI {
    
    @scala.inline
    def apply(
      build: Get,
      info: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
      job: Build,
      node: Config,
      queue: Cancel,
      view: Add
    ): JenkinsAPI = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction1(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[JenkinsAPI]
    }
    
    @scala.inline
    implicit class JenkinsAPIMutableBuilder[Self <: JenkinsAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: Get): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJob(value: Build): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Config): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: Cancel): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Add): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JenkinsClientOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var crumbIssuer: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var promisify: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.native
  }
  object JenkinsClientOptions {
    
    @scala.inline
    def apply(): JenkinsClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JenkinsClientOptions]
    }
    
    @scala.inline
    implicit class JenkinsClientOptionsMutableBuilder[Self <: JenkinsClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCrumbIssuer(value: Boolean): Self = StObject.set(x, "crumbIssuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrumbIssuerUndefined: Self = StObject.set(x, "crumbIssuer", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPromisify(value: Boolean | (js.Function1[/* repeated */ js.Any, _])): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromisifyFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "promisify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  @js.native
  trait JenkinsPromisifiedAPI extends StObject {
    
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
    implicit class JenkinsPromisifiedAPIMutableBuilder[Self <: JenkinsPromisifiedAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: Log): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: () => js.Promise[_]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJob(value: Copy): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Create): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: Item): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Destroy): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JobBuildOptions extends StObject {
    
    var name: String = js.native
    
    var parameters: js.UndefOr[js.Any] = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object JobBuildOptions {
    
    @scala.inline
    def apply(name: String): JobBuildOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobBuildOptions]
    }
    
    @scala.inline
    implicit class JobBuildOptionsMutableBuilder[Self <: JobBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
