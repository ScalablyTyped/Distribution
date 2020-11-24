package typings.hardSourceWebpackPlugin.mod.ParallelModulePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var fork: js.UndefOr[
    js.Function3[
      /* fork */ forkFn, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      /* webpackBin */ String, 
      Unit
    ]
  ] = js.native
  
  var minModules: js.UndefOr[Double] = js.native
  
  var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFork(
      value: (/* fork */ forkFn, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, /* webpackBin */ String) => Unit
    ): Self = this.set("fork", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFork: Self = this.set("fork", js.undefined)
    
    @scala.inline
    def setMinModules(value: Double): Self = this.set("minModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinModules: Self = this.set("minModules", js.undefined)
    
    @scala.inline
    def setNumWorkersFunction0(value: () => Double): Self = this.set("numWorkers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumWorkers(value: Double | js.Function0[Double]): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumWorkers: Self = this.set("numWorkers", js.undefined)
  }
}
