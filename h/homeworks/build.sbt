organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-214973"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-cccf4d",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-8be638",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-b08282",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.7-4f45f7",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-154a5c",
  "org.scalablytyped" %%% "angular__core" % "14.2.7-78fafb",
  "org.scalablytyped" %%% "angular__forms" % "14.2.7-216d82",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-7b08cb",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.4-d9b25c",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1ba1f6",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-1bfc7c",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-d90de9",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "re2" % "1.17.7-fadabd",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-02ab95",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-4e87db",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
