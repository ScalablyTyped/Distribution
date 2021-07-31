package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commit extends StObject {
  
  var all: js.Any
  
  var commit: js.Any
  
  var ctx: IpfsPrint
  
  var number: js.Any
  
  var repo: js.Any
  
  var timeout: js.Any
}
object Commit {
  
  @scala.inline
  def apply(all: js.Any, commit: js.Any, ctx: IpfsPrint, number: js.Any, repo: js.Any, timeout: js.Any): Commit = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Any): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: js.Any): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: IpfsPrint): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: js.Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: js.Any): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
