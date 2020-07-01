organization := "org.scalablytyped"
name := "ionic__storage"
version := "2.2.0-5ef9d4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.11-453a50",
  "org.scalablytyped" %%% "angular__core" % "9.1.11-deee9a",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-17b669",
  "org.scalablytyped" %%% "localforage" % "1.7.4-62969b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-5818d2",
  "org.scalablytyped" %%% "typescript" % "3.9.5-0b3ab7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
