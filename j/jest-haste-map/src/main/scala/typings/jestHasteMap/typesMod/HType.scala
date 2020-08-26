package typings.jestHasteMap.typesMod

import typings.jestHasteMap.jestHasteMapNumbers.`0`
import typings.jestHasteMap.jestHasteMapNumbers.`1`
import typings.jestHasteMap.jestHasteMapNumbers.`2`
import typings.jestHasteMap.jestHasteMapNumbers.`3`
import typings.jestHasteMap.jestHasteMapNumbers.`4`
import typings.jestHasteMap.jestHasteMapNumbers.`5`
import typings.jestHasteMap.jestHasteMapStrings.Null
import typings.jestHasteMap.jestHasteMapStrings.g
import typings.jestHasteMap.jestHasteMapStrings.native
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HType extends js.Object {
  var DEPENDENCIES: `4` = js.native
  var DEPENDENCY_DELIM: Null = js.native
  var GENERIC_PLATFORM: g = js.native
  var ID: `0` = js.native
  var MODULE: `0` = js.native
  var MTIME: `1` = js.native
  var NATIVE_PLATFORM: native = js.native
  var PACKAGE: `1` = js.native
  var PATH: `0` = js.native
  var SHA1: `5` = js.native
  var SIZE: `2` = js.native
  var TYPE: `1` = js.native
  var VISITED: `3` = js.native
}

object HType {
  @scala.inline
  def apply(
    DEPENDENCIES: `4`,
    DEPENDENCY_DELIM: Null,
    GENERIC_PLATFORM: g,
    ID: `0`,
    MODULE: `0`,
    MTIME: `1`,
    NATIVE_PLATFORM: native,
    PACKAGE: `1`,
    PATH: `0`,
    SHA1: `5`,
    SIZE: `2`,
    TYPE: `1`,
    VISITED: `3`
  ): HType = {
    val __obj = js.Dynamic.literal(DEPENDENCIES = DEPENDENCIES.asInstanceOf[js.Any], DEPENDENCY_DELIM = DEPENDENCY_DELIM.asInstanceOf[js.Any], GENERIC_PLATFORM = GENERIC_PLATFORM.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MODULE = MODULE.asInstanceOf[js.Any], MTIME = MTIME.asInstanceOf[js.Any], NATIVE_PLATFORM = NATIVE_PLATFORM.asInstanceOf[js.Any], PACKAGE = PACKAGE.asInstanceOf[js.Any], PATH = PATH.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SIZE = SIZE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], VISITED = VISITED.asInstanceOf[js.Any])
    __obj.asInstanceOf[HType]
  }
  @scala.inline
  implicit class HTypeOps[Self <: HType] (val x: Self) extends AnyVal {
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
    def setDEPENDENCIES(value: `4`): Self = this.set("DEPENDENCIES", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEPENDENCY_DELIM(value: Null): Self = this.set("DEPENDENCY_DELIM", value.asInstanceOf[js.Any])
    @scala.inline
    def setGENERIC_PLATFORM(value: g): Self = this.set("GENERIC_PLATFORM", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: `0`): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE(value: `0`): Self = this.set("MODULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTIME(value: `1`): Self = this.set("MTIME", value.asInstanceOf[js.Any])
    @scala.inline
    def setNATIVE_PLATFORM(value: native): Self = this.set("NATIVE_PLATFORM", value.asInstanceOf[js.Any])
    @scala.inline
    def setPACKAGE(value: `1`): Self = this.set("PACKAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATH(value: `0`): Self = this.set("PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHA1(value: `5`): Self = this.set("SHA1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSIZE(value: `2`): Self = this.set("SIZE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE(value: `1`): Self = this.set("TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setVISITED(value: `3`): Self = this.set("VISITED", value.asInstanceOf[js.Any])
  }
  
}

