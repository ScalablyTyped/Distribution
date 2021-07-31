package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingOptions extends StObject {
  
  /** Whether to enable auto ARIMA or not. */
  var autoArima: js.UndefOr[Boolean] = js.undefined
  
  /** The max value of non-seasonal p and q. */
  var autoArimaMaxOrder: js.UndefOr[String] = js.undefined
  
  /** Batch size for dnn models. */
  var batchSize: js.UndefOr[String] = js.undefined
  
  /** The data frequency of a time series. */
  var dataFrequency: js.UndefOr[String] = js.undefined
  
  /**
    * The column to split data with. This column won't be used as a feature. 1. When data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true value tag
    * are eval data, and the false are training data. 2. When data_split_method is SEQ, the first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are
    * used as training data, and the rest are eval data. It respects the order in Orderable data types:
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
    */
  var dataSplitColumn: js.UndefOr[String] = js.undefined
  
  /**
    * The fraction of evaluation data over the whole input data. The rest of data will be used as training data. The format should be double. Accurate to two decimal places. Default value
    * is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double] = js.undefined
  
  /** The data split type for training and evaluation, e.g. RANDOM. */
  var dataSplitMethod: js.UndefOr[String] = js.undefined
  
  /** Distance type for clustering models. */
  var distanceType: js.UndefOr[String] = js.undefined
  
  /** Dropout probability for dnn models. */
  var dropout: js.UndefOr[Double] = js.undefined
  
  /** Whether to stop early when the loss doesn't improve significantly any more (compared to min_relative_progress). Used only for iterative training algorithms. */
  var earlyStop: js.UndefOr[Boolean] = js.undefined
  
  /** Feedback type that specifies which algorithm to run for matrix factorization. */
  var feedbackType: js.UndefOr[String] = js.undefined
  
  /** Hidden units for dnn models. */
  var hiddenUnits: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled. */
  var holidayRegion: js.UndefOr[String] = js.undefined
  
  /** The number of periods ahead that need to be forecasted. */
  var horizon: js.UndefOr[String] = js.undefined
  
  /** Include drift when fitting an ARIMA model. */
  var includeDrift: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the initial learning rate for the line search learn rate strategy. */
  var initialLearnRate: js.UndefOr[Double] = js.undefined
  
  /** Name of input label columns in training data. */
  var inputLabelColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Item column specified for matrix factorization models. */
  var itemColumn: js.UndefOr[String] = js.undefined
  
  /** The column used to provide the initial centroids for kmeans algorithm when kmeans_initialization_method is CUSTOM. */
  var kmeansInitializationColumn: js.UndefOr[String] = js.undefined
  
  /** The method used to initialize the centroids for kmeans algorithm. */
  var kmeansInitializationMethod: js.UndefOr[String] = js.undefined
  
  /** L1 regularization coefficient. */
  var l1Regularization: js.UndefOr[Double] = js.undefined
  
  /** L2 regularization coefficient. */
  var l2Regularization: js.UndefOr[Double] = js.undefined
  
  /** Weights associated with each label class, for rebalancing the training data. Only applicable for classification models. */
  var labelClassWeights: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.TrainingOptions & TopLevel[js.Any]
  ] = js.undefined
  
  /** Learning rate in training. Used only for iterative training algorithms. */
  var learnRate: js.UndefOr[Double] = js.undefined
  
  /** The strategy to determine learn rate for the current iteration. */
  var learnRateStrategy: js.UndefOr[String] = js.undefined
  
  /** Type of loss function used during training run. */
  var lossType: js.UndefOr[String] = js.undefined
  
  /** The maximum number of iterations in training. Used only for iterative training algorithms. */
  var maxIterations: js.UndefOr[String] = js.undefined
  
  /** Maximum depth of a tree for boosted tree models. */
  var maxTreeDepth: js.UndefOr[String] = js.undefined
  
  /** When early_stop is true, stops training when accuracy improvement is less than 'min_relative_progress'. Used only for iterative training algorithms. */
  var minRelativeProgress: js.UndefOr[Double] = js.undefined
  
  /** Minimum split loss for boosted tree models. */
  var minSplitLoss: js.UndefOr[Double] = js.undefined
  
  /** [Beta] Google Cloud Storage URI from which the model was imported. Only applicable for imported models. */
  var modelUri: js.UndefOr[String] = js.undefined
  
  /** A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are the AR order, the degree of differencing, and the MA order. */
  var nonSeasonalOrder: js.UndefOr[ArimaOrder] = js.undefined
  
  /** Number of clusters for clustering models. */
  var numClusters: js.UndefOr[String] = js.undefined
  
  /** Num factors specified for matrix factorization models. */
  var numFactors: js.UndefOr[String] = js.undefined
  
  /** Optimization strategy for training linear regression models. */
  var optimizationStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to preserve the input structs in output feature names. Suppose there is a struct A with field b. When false (default), the output feature name is A_b. When true, the output
    * feature name is A.b.
    */
  var preserveInputStructs: js.UndefOr[Boolean] = js.undefined
  
  /** Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree models. */
  var subsample: js.UndefOr[Double] = js.undefined
  
  /** Column to be designated as time series data for ARIMA model. */
  var timeSeriesDataColumn: js.UndefOr[String] = js.undefined
  
  /** The id column that will be used to indicate different time series to forecast in parallel. */
  var timeSeriesIdColumn: js.UndefOr[String] = js.undefined
  
  /** Column to be designated as time series timestamp for ARIMA model. */
  var timeSeriesTimestampColumn: js.UndefOr[String] = js.undefined
  
  /** User column specified for matrix factorization models. */
  var userColumn: js.UndefOr[String] = js.undefined
  
  /** Hyperparameter for matrix factoration when implicit feedback type is specified. */
  var walsAlpha: js.UndefOr[Double] = js.undefined
  
  /** Whether to train a model from the last checkpoint. */
  var warmStart: js.UndefOr[Boolean] = js.undefined
}
object TrainingOptions {
  
  @scala.inline
  def apply(): TrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingOptions]
  }
  
  @scala.inline
  implicit class TrainingOptionsMutableBuilder[Self <: TrainingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoArima(value: Boolean): Self = StObject.set(x, "autoArima", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoArimaMaxOrder(value: String): Self = StObject.set(x, "autoArimaMaxOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoArimaMaxOrderUndefined: Self = StObject.set(x, "autoArimaMaxOrder", js.undefined)
    
    @scala.inline
    def setAutoArimaUndefined: Self = StObject.set(x, "autoArima", js.undefined)
    
    @scala.inline
    def setBatchSize(value: String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setDataFrequency(value: String): Self = StObject.set(x, "dataFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFrequencyUndefined: Self = StObject.set(x, "dataFrequency", js.undefined)
    
    @scala.inline
    def setDataSplitColumn(value: String): Self = StObject.set(x, "dataSplitColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSplitColumnUndefined: Self = StObject.set(x, "dataSplitColumn", js.undefined)
    
    @scala.inline
    def setDataSplitEvalFraction(value: Double): Self = StObject.set(x, "dataSplitEvalFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSplitEvalFractionUndefined: Self = StObject.set(x, "dataSplitEvalFraction", js.undefined)
    
    @scala.inline
    def setDataSplitMethod(value: String): Self = StObject.set(x, "dataSplitMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSplitMethodUndefined: Self = StObject.set(x, "dataSplitMethod", js.undefined)
    
    @scala.inline
    def setDistanceType(value: String): Self = StObject.set(x, "distanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceTypeUndefined: Self = StObject.set(x, "distanceType", js.undefined)
    
    @scala.inline
    def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
    
    @scala.inline
    def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    @scala.inline
    def setFeedbackType(value: String): Self = StObject.set(x, "feedbackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackTypeUndefined: Self = StObject.set(x, "feedbackType", js.undefined)
    
    @scala.inline
    def setHiddenUnits(value: js.Array[String]): Self = StObject.set(x, "hiddenUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUnitsUndefined: Self = StObject.set(x, "hiddenUnits", js.undefined)
    
    @scala.inline
    def setHiddenUnitsVarargs(value: String*): Self = StObject.set(x, "hiddenUnits", js.Array(value :_*))
    
    @scala.inline
    def setHolidayRegion(value: String): Self = StObject.set(x, "holidayRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidayRegionUndefined: Self = StObject.set(x, "holidayRegion", js.undefined)
    
    @scala.inline
    def setHorizon(value: String): Self = StObject.set(x, "horizon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizonUndefined: Self = StObject.set(x, "horizon", js.undefined)
    
    @scala.inline
    def setIncludeDrift(value: Boolean): Self = StObject.set(x, "includeDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDriftUndefined: Self = StObject.set(x, "includeDrift", js.undefined)
    
    @scala.inline
    def setInitialLearnRate(value: Double): Self = StObject.set(x, "initialLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialLearnRateUndefined: Self = StObject.set(x, "initialLearnRate", js.undefined)
    
    @scala.inline
    def setInputLabelColumns(value: js.Array[String]): Self = StObject.set(x, "inputLabelColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLabelColumnsUndefined: Self = StObject.set(x, "inputLabelColumns", js.undefined)
    
    @scala.inline
    def setInputLabelColumnsVarargs(value: String*): Self = StObject.set(x, "inputLabelColumns", js.Array(value :_*))
    
    @scala.inline
    def setItemColumn(value: String): Self = StObject.set(x, "itemColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemColumnUndefined: Self = StObject.set(x, "itemColumn", js.undefined)
    
    @scala.inline
    def setKmeansInitializationColumn(value: String): Self = StObject.set(x, "kmeansInitializationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmeansInitializationColumnUndefined: Self = StObject.set(x, "kmeansInitializationColumn", js.undefined)
    
    @scala.inline
    def setKmeansInitializationMethod(value: String): Self = StObject.set(x, "kmeansInitializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmeansInitializationMethodUndefined: Self = StObject.set(x, "kmeansInitializationMethod", js.undefined)
    
    @scala.inline
    def setL1Regularization(value: Double): Self = StObject.set(x, "l1Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL1RegularizationUndefined: Self = StObject.set(x, "l1Regularization", js.undefined)
    
    @scala.inline
    def setL2Regularization(value: Double): Self = StObject.set(x, "l2Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2RegularizationUndefined: Self = StObject.set(x, "l2Regularization", js.undefined)
    
    @scala.inline
    def setLabelClassWeights(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.TrainingOptions & TopLevel[js.Any]
    ): Self = StObject.set(x, "labelClassWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelClassWeightsUndefined: Self = StObject.set(x, "labelClassWeights", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: String): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    @scala.inline
    def setMaxTreeDepth(value: String): Self = StObject.set(x, "maxTreeDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTreeDepthUndefined: Self = StObject.set(x, "maxTreeDepth", js.undefined)
    
    @scala.inline
    def setMinRelativeProgress(value: Double): Self = StObject.set(x, "minRelativeProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRelativeProgressUndefined: Self = StObject.set(x, "minRelativeProgress", js.undefined)
    
    @scala.inline
    def setMinSplitLoss(value: Double): Self = StObject.set(x, "minSplitLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSplitLossUndefined: Self = StObject.set(x, "minSplitLoss", js.undefined)
    
    @scala.inline
    def setModelUri(value: String): Self = StObject.set(x, "modelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUriUndefined: Self = StObject.set(x, "modelUri", js.undefined)
    
    @scala.inline
    def setNonSeasonalOrder(value: ArimaOrder): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    @scala.inline
    def setNumClusters(value: String): Self = StObject.set(x, "numClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClustersUndefined: Self = StObject.set(x, "numClusters", js.undefined)
    
    @scala.inline
    def setNumFactors(value: String): Self = StObject.set(x, "numFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFactorsUndefined: Self = StObject.set(x, "numFactors", js.undefined)
    
    @scala.inline
    def setOptimizationStrategy(value: String): Self = StObject.set(x, "optimizationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationStrategyUndefined: Self = StObject.set(x, "optimizationStrategy", js.undefined)
    
    @scala.inline
    def setPreserveInputStructs(value: Boolean): Self = StObject.set(x, "preserveInputStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveInputStructsUndefined: Self = StObject.set(x, "preserveInputStructs", js.undefined)
    
    @scala.inline
    def setSubsample(value: Double): Self = StObject.set(x, "subsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsampleUndefined: Self = StObject.set(x, "subsample", js.undefined)
    
    @scala.inline
    def setTimeSeriesDataColumn(value: String): Self = StObject.set(x, "timeSeriesDataColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesDataColumnUndefined: Self = StObject.set(x, "timeSeriesDataColumn", js.undefined)
    
    @scala.inline
    def setTimeSeriesIdColumn(value: String): Self = StObject.set(x, "timeSeriesIdColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesIdColumnUndefined: Self = StObject.set(x, "timeSeriesIdColumn", js.undefined)
    
    @scala.inline
    def setTimeSeriesTimestampColumn(value: String): Self = StObject.set(x, "timeSeriesTimestampColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesTimestampColumnUndefined: Self = StObject.set(x, "timeSeriesTimestampColumn", js.undefined)
    
    @scala.inline
    def setUserColumn(value: String): Self = StObject.set(x, "userColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserColumnUndefined: Self = StObject.set(x, "userColumn", js.undefined)
    
    @scala.inline
    def setWalsAlpha(value: Double): Self = StObject.set(x, "walsAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalsAlphaUndefined: Self = StObject.set(x, "walsAlpha", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
