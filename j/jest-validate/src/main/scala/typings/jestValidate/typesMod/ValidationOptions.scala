package typings.jestValidate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends js.Object {
  
  var comment: js.UndefOr[String] = js.native
  
  var condition: js.UndefOr[js.Function2[/* option */ js.Any, /* validOption */ js.Any, Boolean]] = js.native
  
  var deprecate: js.UndefOr[
    js.Function4[
      /* config */ Record[String, _], 
      /* option */ String, 
      /* deprecatedOptions */ DeprecatedOptions, 
      /* options */ this.type, 
      Boolean
    ]
  ] = js.native
  
  var deprecatedConfig: js.UndefOr[DeprecatedOptions] = js.native
  
  var error: js.UndefOr[
    js.Function5[
      /* option */ String, 
      /* received */ js.Any, 
      /* defaultValue */ js.Any, 
      /* options */ this.type, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
  
  var exampleConfig: Record[String, _] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var recursiveBlacklist: js.UndefOr[js.Array[String]] = js.native
  
  var recursiveDenylist: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[Title] = js.native
  
  var unknown: js.UndefOr[
    js.Function5[
      /* config */ Record[String, _], 
      /* exampleConfig */ Record[String, _], 
      /* option */ String, 
      /* options */ this.type, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(exampleConfig: Record[String, _]): ValidationOptions = {
    val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
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
    def setExampleConfig(value: Record[String, _]): Self = this.set("exampleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCondition(value: (/* option */ js.Any, /* validOption */ js.Any) => Boolean): Self = this.set("condition", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDeprecate(
      value: (/* config */ Record[String, _], /* option */ String, /* deprecatedOptions */ DeprecatedOptions, ValidationOptions) => Boolean
    ): Self = this.set("deprecate", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDeprecate: Self = this.set("deprecate", js.undefined)
    
    @scala.inline
    def setDeprecatedConfig(value: DeprecatedOptions): Self = this.set("deprecatedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedConfig: Self = this.set("deprecatedConfig", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* option */ String, /* received */ js.Any, /* defaultValue */ js.Any, ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = this.set("error", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setRecursiveBlacklistVarargs(value: String*): Self = this.set("recursiveBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setRecursiveBlacklist(value: js.Array[String]): Self = this.set("recursiveBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveBlacklist: Self = this.set("recursiveBlacklist", js.undefined)
    
    @scala.inline
    def setRecursiveDenylistVarargs(value: String*): Self = this.set("recursiveDenylist", js.Array(value :_*))
    
    @scala.inline
    def setRecursiveDenylist(value: js.Array[String]): Self = this.set("recursiveDenylist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveDenylist: Self = this.set("recursiveDenylist", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUnknown(
      value: (/* config */ Record[String, _], /* exampleConfig */ Record[String, _], /* option */ String, ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = this.set("unknown", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
