organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-7068eb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7ea915",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-aa56af",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-578732",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "commander" % "2.19.0-c77268",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-4b83ac",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-5f81ae",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-448338",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3a7207",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-f312f2",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-88152c",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-eaeace",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "tslint" % "5.13.1-897c4d",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-b4b0da",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        