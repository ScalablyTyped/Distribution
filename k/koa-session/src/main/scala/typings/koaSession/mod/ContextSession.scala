package typings.koaSession.mod

import typings.koa.mod.Application
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koaSession.koaSessionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextSession extends js.Object {
  
  var app: Application[DefaultState, DefaultContext] = js.native
  
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[Unit] = js.native
  
  var ctx: Context = js.native
  
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session = js.native
  
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[Unit] = js.native
  
  var opts: typings.koaSession.mod.opts = js.native
  
  var prevHash: String = js.native
  
  var session: Session | `false` = js.native
  
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): Unit = js.native
  
  var store: stores = js.native
}
object ContextSession {
  
  @scala.inline
  def apply(
    app: Application[DefaultState, DefaultContext],
    commit: () => js.Promise[Unit],
    ctx: Context,
    get: () => Session,
    initFromExternal: () => js.Promise[Unit],
    opts: opts,
    prevHash: String,
    session: Session | `false`,
    set: js.Any => Unit,
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), ctx = ctx.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), initFromExternal = js.Any.fromFunction0(initFromExternal), opts = opts.asInstanceOf[js.Any], prevHash = prevHash.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSession]
  }
  
  @scala.inline
  implicit class ContextSessionOps[Self <: ContextSession] (val x: Self) extends AnyVal {
    
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
    def setApp(value: Application[DefaultState, DefaultContext]): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: () => js.Promise[Unit]): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCtx(value: Context): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: () => Session): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFromExternal(value: () => js.Promise[Unit]): Self = this.set("initFromExternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpts(value: opts): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevHash(value: String): Self = this.set("prevHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Session | `false`): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStore(value: stores): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
