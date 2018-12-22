organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180511Z-3a74f2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-c44bc0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-72d3ab",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-788e48",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-0d72d4",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-97bacc",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180511Z-d84670",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-b7fe6a",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-79e23b",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-575421",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-9db825",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-4ee0d1",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-4650e0",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-7229e4",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-e4022e",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-a68813",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-b19b65",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-14bff6",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-35b0e9",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-b10a31",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-dae161",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-480c3d",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-565216",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-0e3de7",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-a1ca7d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        