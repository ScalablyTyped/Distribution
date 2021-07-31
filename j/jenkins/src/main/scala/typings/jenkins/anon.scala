package typings.jenkins

import typings.jenkins.jenkinsBooleans.`false`
import typings.jenkins.jenkinsBooleans.`true`
import typings.jenkins.jenkinsStrings.html
import typings.jenkins.jenkinsStrings.list
import typings.jenkins.jenkinsStrings.my
import typings.jenkins.jenkinsStrings.text
import typings.jenkins.mod.JobBuildOptions
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Add extends StObject {
    
    def add(name: String, job: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def config(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def config(name: String, xml: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    @JSName("create")
    def create_list(name: String, `type`: list, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    @JSName("create")
    def create_my(name: String, `type`: my, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def remove(name: String, job: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var promisify: js.UndefOr[`false`] = js.undefined
  }
  object BaseUrl {
    
    @scala.inline
    def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
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
      def setPromisify(value: `false`): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  @js.native
  trait Build extends StObject {
    
    def build(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def build(name: String, parameters: js.Any, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def build(
      name: String,
      parameters: js.Any,
      token: String,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    def build(name: JobBuildOptions, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def config(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def config(name: String, xml: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def copy(name: String, from: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def create(name: String, xml: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def disable(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def enable(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  }
  
  trait Cancel extends StObject {
    
    def cancel(n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit
    
    def item(n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
    
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
  }
  object Cancel {
    
    @scala.inline
    def apply(
      cancel: (Double, js.Function1[/* err */ Error, Unit]) => Unit,
      item: (Double, js.Function2[/* err */ Error, /* data */ js.Any, Unit]) => Unit,
      list: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit
    ): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), item = js.Any.fromFunction2(item), list = js.Any.fromFunction1(list))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: (Double, js.Function1[/* err */ Error, Unit]) => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItem(value: (Double, js.Function2[/* err */ Error, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "item", js.Any.fromFunction2(value))
      
      @scala.inline
      def setList(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    def config(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def create(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def disable(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def disable(name: String, message: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def disconnect(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def disconnect(name: String, message: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def enable(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ Error, /* data */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def list(full: Boolean, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait Copy extends StObject {
    
    def build(name: String): js.Promise[js.Any] = js.native
    def build(name: String, parameters: js.Any): js.Promise[js.Any] = js.native
    def build(name: String, parameters: js.Any, token: String): js.Promise[js.Any] = js.native
    def build(name: String, parameters: Unit, token: String): js.Promise[js.Any] = js.native
    def build(opts: JobBuildOptions): js.Promise[js.Any] = js.native
    
    def config(name: String): js.Promise[js.Any] = js.native
    def config(name: String, xml: String): js.Promise[js.Any] = js.native
    
    def copy(name: String, from: String): js.Promise[Unit] = js.native
    
    def create(name: String, xml: String): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def disable(name: String): js.Promise[Unit] = js.native
    
    def enable(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[js.Any] = js.native
    
    def list(): js.Promise[js.Any] = js.native
  }
  
  @js.native
  trait Create extends StObject {
    
    def config(name: String): js.Promise[js.Any] = js.native
    
    def create(name: String): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def disable(name: String): js.Promise[Unit] = js.native
    def disable(name: String, message: String): js.Promise[Unit] = js.native
    
    def disconnect(name: String): js.Promise[Unit] = js.native
    def disconnect(name: String, message: String): js.Promise[Unit] = js.native
    
    def enable(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[js.Any] = js.native
    
    def list(): js.Promise[js.Any] = js.native
    def list(full: Boolean): js.Promise[js.Any] = js.native
  }
  
  trait CrumbIssuer extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var promisify: `true`
  }
  object CrumbIssuer {
    
    @scala.inline
    def apply(): CrumbIssuer = {
      val __obj = js.Dynamic.literal(promisify = true)
      __obj.asInstanceOf[CrumbIssuer]
    }
    
    @scala.inline
    implicit class CrumbIssuerMutableBuilder[Self <: CrumbIssuer] (val x: Self) extends AnyVal {
      
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
      def setPromisify(value: `true`): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[text | html] = js.undefined
  }
  object Delay {
    
    @scala.inline
    def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setType(value: text | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Destroy extends StObject {
    
    def add(name: String, job: String): js.Promise[Unit] = js.native
    
    def config(name: String): js.Promise[js.Any] = js.native
    def config(name: String, xml: String): js.Promise[js.Any] = js.native
    
    @JSName("create")
    def create_list(name: String, `type`: list): js.Promise[Unit] = js.native
    @JSName("create")
    def create_my(name: String, `type`: my): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[js.Any] = js.native
    
    def list(): js.Promise[js.Any] = js.native
    
    def remove(name: String, job: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(name: String, n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    def log(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def log(name: String, n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    def log(
      name: String,
      n: Double,
      start: Double,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    
    def logStream(name: String, n: Double): ReadableStream = js.native
    def logStream(name: String, n: Double, options: Delay): ReadableStream = js.native
    
    @JSName("log")
    def log_html(
      name: String,
      n: Double,
      start: Double,
      `type`: html,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    @JSName("log")
    def log_html(
      name: String,
      n: Double,
      start: Double,
      `type`: html,
      meta: Boolean,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    @JSName("log")
    def log_text(
      name: String,
      n: Double,
      start: Double,
      `type`: text,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    @JSName("log")
    def log_text(
      name: String,
      n: Double,
      start: Double,
      `type`: text,
      meta: Boolean,
      callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
    ): Unit = js.native
    
    def stop(name: String, n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def term(name: String, n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  trait Item extends StObject {
    
    def cancel(n: Double): js.Promise[Unit]
    
    def item(n: Double): js.Promise[js.Any]
    
    def list(): js.Promise[js.Any]
  }
  object Item {
    
    @scala.inline
    def apply(
      cancel: Double => js.Promise[Unit],
      item: Double => js.Promise[js.Any],
      list: () => js.Promise[js.Any]
    ): Item = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = js.Any.fromFunction0(list))
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Double => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItem(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setList(value: () => js.Promise[js.Any]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    def get(name: String, n: Double): js.Promise[js.Any] = js.native
    
    def log(name: String, n: Double): js.Promise[js.Any] = js.native
    def log(name: String, n: Double, start: Double): js.Promise[js.Any] = js.native
    def log(name: String, n: Double, start: Double, `type`: Unit, meta: Boolean): js.Promise[js.Any] = js.native
    def log(name: String, n: Double, start: Unit, `type`: Unit, meta: Boolean): js.Promise[js.Any] = js.native
    
    def logStream(name: String, n: Double): js.Promise[js.Any] = js.native
    def logStream(name: String, n: Double, `type`: Unit, delay: Double): js.Promise[js.Any] = js.native
    @JSName("logStream")
    def logStream_html(name: String, n: Double, `type`: html): js.Promise[js.Any] = js.native
    @JSName("logStream")
    def logStream_html(name: String, n: Double, `type`: html, delay: Double): js.Promise[js.Any] = js.native
    @JSName("logStream")
    def logStream_text(name: String, n: Double, `type`: text): js.Promise[js.Any] = js.native
    @JSName("logStream")
    def logStream_text(name: String, n: Double, `type`: text, delay: Double): js.Promise[js.Any] = js.native
    
    @JSName("log")
    def log_html(name: String, n: Double, start: Double, `type`: html): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_html(name: String, n: Double, start: Double, `type`: html, meta: Boolean): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_html(name: String, n: Double, start: Unit, `type`: html): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_html(name: String, n: Double, start: Unit, `type`: html, meta: Boolean): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_text(name: String, n: Double, start: Double, `type`: text): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_text(name: String, n: Double, start: Double, `type`: text, meta: Boolean): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_text(name: String, n: Double, start: Unit, `type`: text): js.Promise[js.Any] = js.native
    @JSName("log")
    def log_text(name: String, n: Double, start: Unit, `type`: text, meta: Boolean): js.Promise[js.Any] = js.native
    
    def stop(name: String, n: Double): js.Promise[Unit] = js.native
    
    def term(name: String, n: Double): js.Promise[Unit] = js.native
  }
}
