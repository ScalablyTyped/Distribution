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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): JenkinsAPI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[JenkinsAPI]
  inline def apply(opts: BaseUrl): JenkinsAPI = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[JenkinsAPI]
  inline def apply(opts: CrumbIssuer): JenkinsPromisifiedAPI = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[JenkinsPromisifiedAPI]
  
  @JSImport("jenkins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JenkinsAPI extends StObject {
    
    var build: Get
    
    def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
    
    var job: Build
    
    var node: Config
    
    var queue: Cancel
    
    var view: Add
  }
  object JenkinsAPI {
    
    inline def apply(
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
    
    extension [Self <: JenkinsAPI](x: Self) {
      
      inline def setBuild(value: Get): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setJob(value: Build): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Config): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Cancel): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setView(value: Add): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait JenkinsClientOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var promisify: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
  }
  object JenkinsClientOptions {
    
    inline def apply(): JenkinsClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JenkinsClientOptions]
    }
    
    extension [Self <: JenkinsClientOptions](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCrumbIssuer(value: Boolean): Self = StObject.set(x, "crumbIssuer", value.asInstanceOf[js.Any])
      
      inline def setCrumbIssuerUndefined: Self = StObject.set(x, "crumbIssuer", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPromisify(value: Boolean | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      inline def setPromisifyFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "promisify", js.Any.fromFunction1(value))
      
      inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  trait JenkinsPromisifiedAPI extends StObject {
    
    var build: Log
    
    def info(): js.Promise[js.Any]
    
    var job: Copy
    
    var node: Create
    
    var queue: Item
    
    var view: Destroy
  }
  object JenkinsPromisifiedAPI {
    
    inline def apply(build: Log, info: () => js.Promise[js.Any], job: Copy, node: Create, queue: Item, view: Destroy): JenkinsPromisifiedAPI = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[JenkinsPromisifiedAPI]
    }
    
    extension [Self <: JenkinsPromisifiedAPI](x: Self) {
      
      inline def setBuild(value: Log): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: () => js.Promise[js.Any]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      inline def setJob(value: Copy): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Create): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Item): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setView(value: Destroy): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobBuildOptions extends StObject {
    
    var name: String
    
    var parameters: js.UndefOr[js.Any] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object JobBuildOptions {
    
    inline def apply(name: String): JobBuildOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobBuildOptions]
    }
    
    extension [Self <: JobBuildOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
