package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trusteer {
  
  trait AssesmentRisk extends StObject {
    
    var additionalData: String
    
    var lastCalculated: Double
    
    var name: String
    
    var value: Double
  }
  object AssesmentRisk {
    
    @scala.inline
    def apply(additionalData: String, lastCalculated: Double, name: String, value: Double): AssesmentRisk = {
      val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], lastCalculated = lastCalculated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssesmentRisk]
    }
    
    @scala.inline
    implicit class AssesmentRiskMutableBuilder[Self <: AssesmentRisk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastCalculated(value: Double): Self = StObject.set(x, "lastCalculated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssetmentRisks extends StObject {
    
    var device_key: String
    
    @JSName("malware.any")
    var malwareDotany: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("network.wifi")
    var networkDotwifi: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("os.rooted")
    var osDotrooted: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("os.rooted.hiders")
    var osDotrootedDothiders: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("os.rooted.native")
    var osDotrootedDotnative: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("os.ver_up_to_date")
    var osDotver_up_to_date: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("plat.android.apprestrict")
    var platDotandroidDotapprestrict: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("plat.android.dumpsys")
    var platDotandroidDotdumpsys: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("tas.config_update")
    var tasDotconfig_update: js.UndefOr[AssesmentRisk] = js.undefined
    
    @JSName("total.risk.generic")
    var totalDotriskDotgeneric: js.UndefOr[AssesmentRisk] = js.undefined
  }
  object AssetmentRisks {
    
    @scala.inline
    def apply(device_key: String): AssetmentRisks = {
      val __obj = js.Dynamic.literal(device_key = device_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetmentRisks]
    }
    
    @scala.inline
    implicit class AssetmentRisksMutableBuilder[Self <: AssetmentRisks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice_key(value: String): Self = StObject.set(x, "device_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMalwareDotany(value: AssesmentRisk): Self = StObject.set(x, "malware.any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMalwareDotanyUndefined: Self = StObject.set(x, "malware.any", js.undefined)
      
      @scala.inline
      def setNetworkDotwifi(value: AssesmentRisk): Self = StObject.set(x, "network.wifi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkDotwifiUndefined: Self = StObject.set(x, "network.wifi", js.undefined)
      
      @scala.inline
      def setOsDotrooted(value: AssesmentRisk): Self = StObject.set(x, "os.rooted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsDotrootedDothiders(value: AssesmentRisk): Self = StObject.set(x, "os.rooted.hiders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsDotrootedDothidersUndefined: Self = StObject.set(x, "os.rooted.hiders", js.undefined)
      
      @scala.inline
      def setOsDotrootedDotnative(value: AssesmentRisk): Self = StObject.set(x, "os.rooted.native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsDotrootedDotnativeUndefined: Self = StObject.set(x, "os.rooted.native", js.undefined)
      
      @scala.inline
      def setOsDotrootedUndefined: Self = StObject.set(x, "os.rooted", js.undefined)
      
      @scala.inline
      def setOsDotver_up_to_date(value: AssesmentRisk): Self = StObject.set(x, "os.ver_up_to_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsDotver_up_to_dateUndefined: Self = StObject.set(x, "os.ver_up_to_date", js.undefined)
      
      @scala.inline
      def setPlatDotandroidDotapprestrict(value: AssesmentRisk): Self = StObject.set(x, "plat.android.apprestrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatDotandroidDotapprestrictUndefined: Self = StObject.set(x, "plat.android.apprestrict", js.undefined)
      
      @scala.inline
      def setPlatDotandroidDotdumpsys(value: AssesmentRisk): Self = StObject.set(x, "plat.android.dumpsys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatDotandroidDotdumpsysUndefined: Self = StObject.set(x, "plat.android.dumpsys", js.undefined)
      
      @scala.inline
      def setTasDotconfig_update(value: AssesmentRisk): Self = StObject.set(x, "tas.config_update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasDotconfig_updateUndefined: Self = StObject.set(x, "tas.config_update", js.undefined)
      
      @scala.inline
      def setTotalDotriskDotgeneric(value: AssesmentRisk): Self = StObject.set(x, "total.risk.generic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDotriskDotgenericUndefined: Self = StObject.set(x, "total.risk.generic", js.undefined)
    }
  }
}
