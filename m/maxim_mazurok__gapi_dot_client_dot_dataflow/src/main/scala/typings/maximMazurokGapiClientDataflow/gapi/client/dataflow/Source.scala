package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * While splitting, sources may specify the produced bundles as differences against another source, in order to save backend-side memory and allow bigger jobs. For details, see
    * SourceSplitRequest. To support this use case, the full set of parameters of the source is logically obtained by taking the latest explicitly specified value of each parameter in the
    * order: base_specs (later items win), spec (overrides anything in base_specs).
    */
  var baseSpecs: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
  
  /** The codec to use to decode data read from the source. */
  var codec: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * Setting this value to true hints to the framework that the source doesn't need splitting, and using SourceSplitRequest on it would yield SOURCE_SPLIT_OUTCOME_USE_CURRENT. E.g. a
    * file splitter may set this to true when splitting a single file into a set of byte ranges of appropriate size, and set this to false when splitting a filepattern into individual
    * files. However, for efficiency, a file splitter may decide to produce file subranges directly from the filepattern to avoid a splitting round-trip. See SourceSplitRequest for an
    * overview of the splitting process. This field is meaningful only in the Source objects populated by the user (e.g. when filling in a DerivedSource). Source objects supplied by the
    * framework to the user don't have this field populated.
    */
  var doesNotNeedSplitting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optionally, metadata for this source can be supplied right away, avoiding a SourceGetMetadataOperation roundtrip (see SourceOperationRequest). This field is meaningful only in the
    * Source objects populated by the user (e.g. when filling in a DerivedSource). Source objects supplied by the framework to the user don't have this field populated.
    */
  var metadata: js.UndefOr[SourceMetadata] = js.undefined
  
  /** The source to read from, plus its parameters. */
  var spec: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setBaseSpecs(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "baseSpecs", value.asInstanceOf[js.Any])
    
    inline def setBaseSpecsUndefined: Self = StObject.set(x, "baseSpecs", js.undefined)
    
    inline def setBaseSpecsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "baseSpecs", js.Array(value*))
    
    inline def setCodec(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setDoesNotNeedSplitting(value: Boolean): Self = StObject.set(x, "doesNotNeedSplitting", value.asInstanceOf[js.Any])
    
    inline def setDoesNotNeedSplittingUndefined: Self = StObject.set(x, "doesNotNeedSplitting", js.undefined)
    
    inline def setMetadata(value: SourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
