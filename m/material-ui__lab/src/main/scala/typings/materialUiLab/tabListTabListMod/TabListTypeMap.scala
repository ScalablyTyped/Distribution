package typings.materialUiLab.tabListTabListMod

import typings.materialUiLab.materialUiLabStrings.value
import typings.materialUiTypes.mod.Omit
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabListTypeMap[P, D /* <: ElementType[_] */] extends js.Object {
  var classKey: TabListClassKey = js.native
  var defaultComponent: D = js.native
  var props: P with (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
    value
  ]) = js.native
}

object TabListTypeMap {
  @scala.inline
  def apply[P, /* <: typings.react.mod.ElementType[_] */ D](
    classKey: TabListClassKey,
    defaultComponent: D,
    props: P with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
      value
    ])
  ): TabListTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabListTypeMap[P, D]]
  }
  @scala.inline
  implicit class TabListTypeMapOps[Self <: TabListTypeMap[_, _], P, /* <: typings.react.mod.ElementType[_] */ D] (val x: Self with (TabListTypeMap[P, D])) extends AnyVal {
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
    def setClassKey(value: TabListClassKey): Self = this.set("classKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultComponent(value: D): Self = this.set("defaultComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(
      value: P with (Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
          value
        ])
    ): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

