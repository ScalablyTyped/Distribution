package typings.jqueryAjaxfile.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig, Unit], 
      Unit
    ]
  ] = js.native
  
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition, Unit], 
      Unit
    ]
  ] = js.native
  
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
      Unit
    ]
  ] = js.native
  
  var loadViewModel: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* viewModelConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  
  var suppressLoaderExceptions: js.UndefOr[Boolean] = js.native
}
object Loader {
  
  @scala.inline
  def apply(): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
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
    def setGetConfig(
      value: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Unit
    ): Self = this.set("getConfig", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetConfig: Self = this.set("getConfig", js.undefined)
    
    @scala.inline
    def setLoadComponent(
      value: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Unit
    ): Self = this.set("loadComponent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoadComponent: Self = this.set("loadComponent", js.undefined)
    
    @scala.inline
    def setLoadTemplate(
      value: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Unit
    ): Self = this.set("loadTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoadTemplate: Self = this.set("loadTemplate", js.undefined)
    
    @scala.inline
    def setLoadViewModel(
      value: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Unit
    ): Self = this.set("loadViewModel", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoadViewModel: Self = this.set("loadViewModel", js.undefined)
    
    @scala.inline
    def setSuppressLoaderExceptions(value: Boolean): Self = this.set("suppressLoaderExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressLoaderExceptions: Self = this.set("suppressLoaderExceptions", js.undefined)
  }
}
