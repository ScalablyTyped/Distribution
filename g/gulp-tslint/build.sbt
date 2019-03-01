organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-a9a475"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-d302db",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-06990a",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-ec791a",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "commander" % "2.19.0-17acc3",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-499eae",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-a49d44",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-970eae",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6559dc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ab1274",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-294bc3",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-8c0ddb",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "tslint" % "5.13.1-2e0553",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-1e0c38",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        