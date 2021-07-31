package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MashupDataSourceMashupSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * An array of $.ig.DataSource instances holding the disperse data.
    */
  var dataSource: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Indicates whether to ignore records that have no corresponding data in all of the provided data sources.
    */
  var ignorePartialRecords: js.UndefOr[Boolean] = js.undefined
}
object MashupDataSourceMashupSettings {
  
  @scala.inline
  def apply(): MashupDataSourceMashupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MashupDataSourceMashupSettings]
  }
  
  @scala.inline
  implicit class MashupDataSourceMashupSettingsMutableBuilder[Self <: MashupDataSourceMashupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[js.Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePartialRecords(value: Boolean): Self = StObject.set(x, "ignorePartialRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePartialRecordsUndefined: Self = StObject.set(x, "ignorePartialRecords", js.undefined)
  }
}
